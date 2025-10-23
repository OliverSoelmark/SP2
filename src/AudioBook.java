public class AudioBook extends Title {
    private int durationMinutes;
    private int copies;

    public AudioBook(String title, String literatureType, int copies, int durationMinutes) {
        super(title, literatureType);
        this.copies = copies;
        this.durationMinutes = durationMinutes;
    }



    protected double calculatePoints() {
        double minutePrice = durationMinutes*0.5;
        return minutePrice*convertLiteratureType();
    }


}
