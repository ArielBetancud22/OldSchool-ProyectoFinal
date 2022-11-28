import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class StockCel {
    private static ArrayList<Celular> listaMotorola = new ArrayList<>();
    private static ArrayList<Celular> listaApple = new ArrayList<>();

    private static ArrayList<Celular> listaLg = new ArrayList<>();

    private static ArrayList<Celular> listaHuawei = new ArrayList<>();

    private static ArrayList<Celular> listaXiaomi = new ArrayList<>();

<<<<<<< HEAD

    private static ArrayList<Celular> listaSamsung = new ArrayList<>();

=======
>>>>>>> 508ff3e41caa7eeb0a0fc340c49e9a9876f93d80
    private static void llenarMotorola() {
        Celular cel1 = new Celular("Motorola", "Moto g200", "Snapdragon 880", "108mp x 13mp", 90000);
        Celular cel2 = new Celular("Motorola", "Moto g71", "Snapdragon 865", "50mp x 10", 65000);
        Celular cel3 = new Celular("Motorola", "Moto g60s", "Procesador snapdragon 695", "50mp X 2mp", 57.999);
        Celular cel4 = new Celular("Motorola", "Moto Edge Pro 30", "Procesador Sanpdragon 8 gen1", "64mp X 8mp X 5MP X 2P", 55.000);
        Celular cel5 = new Celular("Motorola", "Moto edge 20 lite", "Procesador bimensity 720", "108mp X + 8mp + 2mp", 70.000);


        listaMotorola.add(cel1);
        listaMotorola.add(cel2);
        listaMotorola.add(cel3);
        listaMotorola.add(cel4);
        listaMotorola.add(cel5);
    }

    public static void llenarApple() {
        Celular cel1 = new Celular("Iphone Se-", "Iphone Se", "A13 Bionic", "12mp", 219.000);
        Celular cel2 = new Celular("Iphone 11", "Iphone Se", "A13 Bionic", "12mp", 185.000);
        Celular cel3 = new Celular(" Iphone 12", "Iphone 12", "Procesador A14 Bionic", "12mp", 224.000);
        Celular cel4 = new Celular("Iphone13", "Iphone13", "Procesadr A15 Bionic", "12mpx", 284.000);
        Celular cel5 = new Celular("Iphone 13 Pro Max", "Iphone13 Pro Max", "Procesador A15 Bionic", "12mp", 370.000);


        listaApple.add(cel1);
        listaApple.add(cel2);
        listaApple.add(cel3);
        listaApple.add(cel4);
        listaApple.add(cel5);

    }

    public static void llenarLg() {
        Celular cel1 = new Celular("LG K SERIES K42", "LG K SERIES K42", "Procesador MediaTek MT 6762", "8mpx", 30.000);
        Celular cel2 = new Celular("LG K SERIES K22", "LG K SERIES K22", "Procesador QM215", "5mp X 13MP", 40.000);
        Celular cel3 = new Celular("LGK52", "LG K SERIES K22", "Procesador MediaTek MT6765 Helio P35", "48mp X 13mp", 50.000);
        Celular cel4 = new Celular("LGK41S", "LGK41S", "Procesador MediaTek MT6762 Helio p22", "13mp X 8mp", 60.000);
        Celular cel5 = new Celular("LG K SERIES K62", "LG K SERIES K62", "Procesador MediaTek MT6765", "48mp X 28mp", 65.000);

        listaLg.add(cel1);
        listaLg.add(cel2);
        listaLg.add(cel3);
        listaLg.add(cel4);
        listaLg.add(cel5);
    }

    public static void llenarHuawei() {
        Celular cel1 = new Celular("Huawei mate 30 Pro", "Huawei Mate 30 Pro", "Procesador Hisilicon Kirin 990", "40mp , Frontal 32 Mp", 150.00);
        Celular cel2 = new Celular("Huawei P40 Pro", "HuaweiP40", "Procesador Hisilicon Kirin 990 5g", "40mp, Frontal 32 mp", 200.000);
        Celular cel3 = new Celular("Huwei P30 Pro", "Huawei P30 Pro", "Hilisilicon Kirin 900", "40mp, Frontal 32 mp", 250.000);
        Celular cel4 = new Celular("Huawei P40 Lite", "Huawei P40 Lite", "Procesador HiSilicon Kirin 810", "48mp, Frontal 16mp", 100.000);
        Celular cel5 = new Celular("Huawei Mate 10 Lite", "Huawei Mate 10P Lite", "Procesador HiSilicon Kirin 659", "116mp, Frontal 13mp", 110.000);


        listaHuawei.add(cel1);
        listaHuawei.add(cel2);
        listaHuawei.add(cel3);
        listaHuawei.add(cel4);
        listaHuawei.add(cel5);
    }


    public static void llenarXioami() {
        Celular cel1 = new Celular("Xiaomi Note 10s", "Xiaomi Note 10s", "Procesador MediaTek helio 695", "64px+8mp+2mp", 70.000);
        Celular cel2 = new Celular("Xiaomi Note 10 Pro", "Xiaomi Note 10 Pro", "Procesador qualcom snapdragon 732g", "108mp+8mp+4mp", 90.000);
        Celular cel3 = new Celular("Xiaomi Mi Lite 56ne", "Xioami Mi Lite 56ne", "Procesar qualcom snapdragon 778g", "64mp+8mp+5mp", 82.400);
        Celular cel4 = new Celular("Xiaomi Poco F3", "Xiaomi Poco F3", "Procesador qualcom snapdragon 870", "48mp+8mp+5mp", 95.000);
        Celular cel5 = new Celular("Xiaomi poco x3 GT 56", "Xiaomi poco x3 GT 56", "Procesador qualcom SnapDragon 870", "48mp+8mp+5mp", 10.000);

        listaXiaomi.add(cel1);
        listaXiaomi.add(cel2);
        listaXiaomi.add(cel3);
        listaXiaomi.add(cel4);
        listaXiaomi.add(cel5);
    }


<<<<<<< HEAD
    public static void llenarSamsung() {
        Celular cel1 = new Celular("Samsung", "Galaxy A52-", "Procesador de Octa Core con 6gb de Ram", "64mp + 12mp + 5mp", 65.000);
        Celular cel2 = new Celular("Samsung Galaxy A12-", "Galaxy A12", "Procesador Octa Core con 4gb de RAM", "Camara Quad de 48mp", 40.000);
        Celular cel3 = new Celular("Samsung s20-", "Samsung s21", "Procesador dymensity 1100", "64mp + 9mp + 2mp", 268.000);
        Celular cel4 = new Celular("Samsung Galaxy s21-", "Galaxy S21", "Procesador Octa Core 6gb de RAM", "32mp", 145.000);
        Celular cel5 = new Celular("Samsung S21 FE","Samsung S21 FE","Procesador Octa Core 8GB de Ram","32mp + 8mp + 2mp",200.000);


        listaSamsung.add(cel1);
        listaSamsung.add(cel2);
        listaSamsung.add(cel3);
        listaSamsung.add(cel4);
        listaSamsung.add(cel5);


    }


=======
>>>>>>> 508ff3e41caa7eeb0a0fc340c49e9a9876f93d80
    public static ArrayList<Celular> getListaMotorola() {
        return listaMotorola;
    }

    public static ArrayList<Celular> getListaApple() {
        return listaApple;
    }

    public static ArrayList<Celular> getListaLg() {
<<<<<<< HEAD

=======
>>>>>>> 508ff3e41caa7eeb0a0fc340c49e9a9876f93d80
        return listaLg;
    }

    public static ArrayList<Celular> getListaHuawei() {
        return listaHuawei;
    }
<<<<<<< HEAD

    public static ArrayList<Celular> getListaXiaomi() {
        return listaXiaomi;
    }

    public static ArrayList<Celular> getListaSamsung(){
        return  listaSamsung;
    }

=======

    public static ArrayList<Celular> getListaXiaomi() {
        return listaXiaomi;
    }
>>>>>>> 508ff3e41caa7eeb0a0fc340c49e9a9876f93d80

    public static void init() {
        llenarMotorola();
        llenarApple();
        llenarLg();
        llenarHuawei();
        llenarXioami();
<<<<<<< HEAD
        llenarSamsung();


    }


=======
    }
>>>>>>> 508ff3e41caa7eeb0a0fc340c49e9a9876f93d80
}


