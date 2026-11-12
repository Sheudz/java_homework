package semester1.practice10;

public final class FiscalReceipt implements PrintableDocument
{
    private final String fiscalNumber;
    private final double totalAmount;
    private final double vatAmount;

    public FiscalReceipt(String fiscalNumber, double totalAmount)
    {
        this.fiscalNumber = fiscalNumber;
        this.totalAmount = totalAmount;
        vatAmount = totalAmount * 20 / 120;
    }
    @Override
    public String formatForPrinter()
    {
        return "Чек " + fiscalNumber + " Сума з ПДВ: " + totalAmount + " ПДВ 20% у сумі: " + vatAmount;
    }
}

interface PrintableDocument
{
    String formatForPrinter();
}

class WarehouseReport implements PrintableDocument
{
    private final String warehouse;
    private final int itemCount;

    public WarehouseReport(String warehouse, int itemCount)
    {
        this.warehouse = warehouse;
        this.itemCount = itemCount;
    }
    @Override
    public String formatForPrinter()
    {
        return "Склад: " + warehouse + " Кількість товарів: " + itemCount;
    }
}
