package com.class11Arrays;

public class Task2 {

	// Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
	
    public static void main(String[] args) {
        
        String[] country= {"Colombia", "USA", "Spain"};
        
        for(int i=0; i<=country.length-1; i++) {
            System.out.println(country[i]+"'s");
            
            if(country[i].equals("Colombia")) {
                System.out.println("Capital is Bogota");
                
            }else if (country[i].equals("USA")) {
                System.out.println("Captial is Washington D.C");
                
            }else if (country[i].equals("Spain"))
                System.out.println("Captial is Madrid");
            
            
        }
        System.out.println("--------------------------- 2nd ------------------------------");
        
        for(int i=0; i<country.length; i++) {
            System.out.println(country[i]+"'s");
            
            switch (country[i]) {
            
            
            case "Colombia":
                System.out.println("Capital is Bogota");
                break;
            case "USA":
                System.out.println("Captial is Washington D.C");
                break;
            case "Spain":
                System.out.println("Capital is Madrid");
                break;
            default:
                System.out.println("Error");
                break;
        }
        
            System.out.println("--------------------------- 3rd ------------------------------");
            
            for(String countries: country) {
                System.out.println(countries+"'s");
                
                switch (countries) {
                
                
                case "Colombia":
                    System.out.println("Capital is Bogota");
                    break;
                case "USA":
                    System.out.println("Captial is Washington D.C");
                    break;
                case "Spain":
                    System.out.println("Capital is Madrid");
                    break;
                default:
                    System.out.println("Error");
                    break;
    }
}
}
}
}