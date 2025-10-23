public abstract class Title {
   private String title;
    private String literatureType;
   private static final double RATE=0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

   public double calculateRoyalty(){
        double royalty = calculatePoints()*RATE;
       return royalty;
   }
    // Erklærer metoder, Som først udfyldes og benyttes i de nedarvede klasser (Abstract)
    protected abstract double calculatePoints();

   protected double convertLiteratureType(){
       switch(literatureType){
           case "BI", "TE":
               return 3;
           case  "LYRIK":
               return 6;
           case "SKØN":
               return 1.7;
           case "FAG":
               return 1;
           default:
               return 0;
       }
   }
}
