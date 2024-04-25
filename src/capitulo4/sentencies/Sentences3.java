package capitulo4.sentencies;

public class Sentences3 {
    public static void main(String[] args) {
        int code; // the item code on each invoice
        int liters; // the number of liters in each invoice
        float price; // now the price is not asked per keyboard
        float invoice_amount; // This saves the amount of the current invoice.
        float total_invoicing; // the amount of all invoices
        int liters_cod1; // the total litres sold of product 1 on all invoices
        int over_600; // counter to keep track of all invoices over 600 €
        total_invoicing = 0;
        liters_cod1 = 0;
        over_600 = 0;
        total_invoicing = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Invoice nº " + i);
            code = (int) (Math.random() * 2) + 1;
            System.out.println("product code: " + code);
            liters = (int) (Math.random() * 100) + 1;
            System.out.println("number (liters): " + liters);
            switch (code) {
                case 1:
                    price = 0.6f;
                    break;
                case 2:
                    price = 30f;
                    break;
                case 3:
                    price = 101.25f;
                    break;
                default:
                    price = 0; // this case should not occur
            }
            invoice_amount = liters * price;
            total_invoicing += invoice_amount;
            if (code == 1)
                liters_cod1 += liters;
            if (invoice_amount >= 600)
                over_600++;
        }
        System.out.println("\n\n\nSales Overview\n");
        // total invoicing
        System.out.println("Total invoicing: " + total_invoicing + "€");
        // liters of article 1
        System.out.println("Liters Article 1: " + liters_cod1 + " liters");
        // Invoice of more than 600 euros
        System.out.println("Invoice over 600€: " + over_600);
    }

}
