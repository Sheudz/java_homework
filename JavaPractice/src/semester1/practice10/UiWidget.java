package semester1.practice10;

public abstract class UiWidget
{
    protected String id;
    protected int width;
    protected int height;

    public UiWidget(String id, int width, int height)
    {
        this.id = id;
        this.width = width;
        this.height = height;
    }
    public abstract String renderHtml();

    protected String getAttributes()
    {
        return "id=\"" + id + "\" style=\"width:" + width + "px;height:" + height + "px\"";
    }
}

class ButtonWidget extends UiWidget
{
    private final String label;

    public ButtonWidget(String id, int width, int height, String label)
    {
        super(id, width, height);
        this.label = label;
    }
    @Override
    public String renderHtml()
    {
        return "<button " + getAttributes() + ">" + label + "</button>";
    }
}

class TextInputWidget extends UiWidget
{
    private final String placeholder;

    public TextInputWidget(String id, int width, int height, String placeholder)
    {
        super(id, width, height);
        this.placeholder = placeholder;
    }
    @Override
    public String renderHtml()
    {
        return "<input " + getAttributes() + " placeholder=\"" + placeholder + "\">";
    }
}

class ProgressBarWidget extends UiWidget
{
    private final int progressPercent;

    public ProgressBarWidget(String id, int width, int height, int progressPercent)
    {
        super(id, width, height);
        this.progressPercent = Math.max(0, Math.min(100, progressPercent));
    }
    @Override
    public String renderHtml()
    {
        return "<progress " + getAttributes() + " max=\"100\" value=\"" + progressPercent + "\"></progress>";
    }
}
