import java.util.Scanner;




class Main {
  public static String YesNoInput = "schaap";
  static void click(){
    System.out.println("Klik op enter om verder te gaan...");
    Scanner a = new Scanner(System.in);
    String ab = a.nextLine();
  }
  static void YesNo(){
    Scanner b = new Scanner(System.in);
    String bb = b.nextLine();
    if(bb.equalsIgnoreCase("ja")){
      YesNoInput = "ja";
      
    }
    else if(bb.equalsIgnoreCase("nee")){
     YesNoInput = "nee";
    }
    else{
      YesNo();
    }
    
  }

  static void begin() {
  System.out.println("Je zit rustig op de bank tv te kijken.");
  click();
  System.out.println("Er komt een nood signaal binnen, op je tv op je telefoon alles.");
  click();
  System.out.println("Je leest het bericht.");
  click();
  System.out.println("Er is een gevaarlijk gas vrij gekomen, ga zo snel mogelijk je huis in en sluit alle ramen en deuren.");
  click();
  System.out.println("Heb ik ramen open staan? denk je terwijl je je deur dicht en op slot doet.");
  click();
  System.out.println("Je rent je hele huis rond om te kijken of er een raam open staat.");
  click();
  System.out.println("Alles is dicht. Denk je terwijl je buiten adem op de bank ploft.");
  click();
  System.out.println("Er wordt op je deur geklopt.");
  click();
  System.out.println("Wie kan dat nou weer zijn? denk je terwijl je naar de deur loopt.");
  click();
  System.out.println("Doe je de deur open? Ja/Nee");
  YesNo();
  if(YesNoInput.equalsIgnoreCase("ja")){
    System.out.println("YESSSS");
  }
  }

  public static void main(String[] args) {
  begin();
  }
}