package Lesson_05.Ex_02;



public class MainShop {

    // Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
    // нескольких товаров.

        public static void main(String...args) {

            ElectrikalShop electrosila = new ElectrikalShop();

            Products product1 = new Products("Video camera PANASONIC HC-V260EE-K", 71178, 521.00);
            Products product2 = new Products("gas hob BOSCH PNP6B6O96R", 96602, 699.00);
            Products product3 = new Products("Car audio ALPINE S-S65", 106929, 189.00);
            Products product4 = new Products("Gamepad XBOX ONE", 82336, 169.90);
            Products product5 = new Products("Voice recorder SONY ICD-PX370", 73720, 183.00);

//
            Payments payment1 = new Payments(Currencies.USD, product1, product2, product3, product4, product5);
            payment1.makePayment(Currencies.BYN, 2000);

//
            System.out.println(" ");
            Payments payment2 = new Payments(Currencies.USD, product1, product2, product4, product5);
            payment2.makePayment(Currencies.BYN, 1150);
//
            System.out.println(" ");
            Payments payment3 = new Payments(Currencies.BYN, product3, product5);
            payment3.makePayment(Currencies.BYN, 2500);
            payment3.makePayment(Currencies.USD, 300);
        }
    }

