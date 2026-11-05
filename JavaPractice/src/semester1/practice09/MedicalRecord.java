package semester1.practice09;

import java.util.Arrays;

public class MedicalRecord
{
    private final String patientId;
    private String fullName;
    private int bloodGroup;
    private boolean rhPositive;
    private String[] allergies;

    public MedicalRecord(String patientId, String fullName, int bloodGroup, boolean rhPositive, String[] allergies)
    {
        this.patientId = patientId;
        this.fullName = fullName;
        this.bloodGroup = bloodGroup >= 1 && bloodGroup <= 4 ? bloodGroup : 1;
        this.rhPositive = rhPositive;
        this.allergies = Arrays.copyOf(allergies, allergies.length);
    }
    public String[] getAllergies()
    {
        return Arrays.copyOf(allergies, allergies.length);
    }
    public boolean hasAllergyTo(String substance)
    {
        for (String allergy : allergies)
        {
            if (allergy.equalsIgnoreCase(substance))
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString()
    {
        String[] groups = {"I (O)", "II (A)", "III (B)", "IV (AB)"};
        return patientId + " " + fullName + " " + groups[bloodGroup - 1] + (rhPositive ? " Rh+" : " Rh-") + " Алергії: " + Arrays.toString(allergies);
    }
}
