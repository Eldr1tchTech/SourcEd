public class Product {
    public String IDHex;
    private String Name;
    private String ShortDescription;
    private String[] Images;
    private String AnimalTreatmentParagraph;
    private double AnimalTreatmentRating;
    private String SustainabilityPargraph;
    private double SustainabilityRating;
    private String ProcessingParagraph;
    private double ProcessingRating;

    public Product(String a, String b, String c, String[] d, String e, double f, String g, double h, String i, double j) {
        this.IDHex = a;
        this.Name = b;
        this.ShortDescription = c;
        this.Images = d;
        this.AnimalTreatmentParagraph = e;
        this.AnimalTreatmentRating = f;
        this.SustainabilityPargraph = g;
        this.SustainabilityRating = h;
        this.ProcessingParagraph = i;
        this.ProcessingRating = j;
    };

    public String ProductFormatting() {
        String b = "";
        for (String a : Images) {
            b = b + ", " + a;
        }
        b = b.substring(0, b.length() - 2);
        return Name + "\n" + ShortDescription + "\n" + b + "\n" + "Animal Treatment\nRating of " + AnimalTreatmentRating + "\n" + AnimalTreatmentParagraph + "\nSustainability\nRating of " + SustainabilityRating + "\n" + SustainabilityPargraph + "\nProcessing\nRating of " + ProcessingRating + "\n" + ProcessingParagraph;
    }
}