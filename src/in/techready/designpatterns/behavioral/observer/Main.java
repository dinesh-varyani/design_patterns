package in.techready.designpatterns.behavioral.observer;

// Main.java
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        StockDisplay display1 = new StockDisplay("Display 1");
        StockDisplay display2 = new StockDisplay("Display 2");

        stockMarket.registerObserver(display1);
        stockMarket.registerObserver(display2);

        // Simulate stock price changes
        stockMarket.setStockPrice(150.50);
        stockMarket.setStockPrice(155.75);

        // Display 1 and Display 2 will receive updates 
        // automatically
    }
}


