public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte age = 16;
        boolean minor = age < 18;
        boolean adult = age >= 18;
        if (adult) {
            System.out.println("Если возраст человека равен " + age + ",то он совершеннолетний.");
        }
        if (minor) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия и нужно немного подождать.");
        }

        System.out.println("Задача 2");
        byte t = -10;
        boolean lowTemperature = t < -5;
        if (t >= -5) {
            System.out.println("На улице " + t + ". Сегодня тепло, можно идти без шапки.");
        }
        if (lowTemperature) {
            System.out.println("На улице " + t + ". Сегодня холодно, нужно надеть шапку.");
        }

        System.out.println("Задача 3");
        byte speed = 75;
        boolean suicideBombing = speed >= 60;
        if (suicideBombing) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф.");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить со спокойной душой.");
        }

        System.out.println("Задача 4");
        byte year = 26;
        if (year >= 2 && year <= 6) {
            System.out.println("Если твой возраст " + year + ", то тебе можно ходить в детский сад.");
        } else if (year >= 7 && year <= 18) {
            System.out.println("Если твой возраст " + year + ", то тебе нужно ходить в школу.");
        } else if (year >= 18 && year <= 24) {
            System.out.println("Если твой возраст " + year + ", то твоё место в универе.");
        } else {
            System.out.println("Если твой возраст " + year + ", то самое время работать.");
        }

        System.out.println("Задача 5");
        byte year_life = 14;
        if (year_life < 5) {
            System.out.println("Если тебе " + year_life + ", то не можешь кататься на атракционе.");
        } else if (year_life >= 5 && year_life < 14) {
            System.out.println("Если тебе " + year_life + ", то ты можешь кататься на атракционе только в сопровождении взрослого.");
        } else {
            System.out.println("Если тебе " + year_life + ", то ты можешь кататься на атракционе без сопровождения взрослого.");
        }
        System.out.println("Задача 6");
        int totalCapacityWagon = 102;
        int seatingPlaces = 60;
        int standingPlaces = totalCapacityWagon - seatingPlaces;
        int seatedPassengers = 28;
        int standingPassengers = 4;
        if (seatedPassengers + standingPassengers >= totalCapacityWagon) {
            System.out.println("В вагоне мест нет.");
        } else if (seatedPassengers >= seatingPlaces && standingPassengers < standingPlaces) {
            System.out.println("В вагоне нет сидячих мест, но есть стоячие места в количестве " + (standingPlaces - standingPassengers) + ".");
        } else if (seatedPassengers < seatingPlaces && standingPassengers < standingPlaces) {
            System.out.println("В вагоне есть как сидячие места в количестве " + (seatingPlaces - seatedPassengers) + ", так и стоячие места в количестве " + (standingPlaces - standingPassengers) + ".");
        } else {
            System.out.println("Вагон полностью пуст.");
        }
        System.out.println("Задача 7");
        int a = 1;
        int b = 3;
        int c = 3;
        if (a > b) {
            if (b >= c) {
                System.out.println("Наибольшее число " + a + ".");
            } else if (c > b && a > c) {
                System.out.println("Наибольшее число " + a + ".");
            } else {
                System.out.println("Наибольшие число " + c + ".");
            }
        } else if (a > c) {
            if (c >= b) {
                System.out.println("Наибольшие число " + a + ".");
            } else if (b > c && a > b) {
                System.out.println("Наибольшее число " + a + ".");
            } else {
                System.out.println("Наибольшие число " + b + ".");
            }
        } else if (b > c) {
            if (a >= c) {
                System.out.println("Наибольшие число " + b + ".");
            } else if (a > c && a > b) {
                System.out.println("Наибольшие число " + a + ".");
            } else {
                System.out.println("Наибольшие число " + b + ".");
            }
        } else if (b > a) {
            if (c >= b) {
                System.out.println("Наибольшие число " + c + ".");
            } else {
                System.out.println("Наибольшие число " + b + ".");
            }
        } else if (c > a) {
            if (b >= a) {
                System.out.println("Наибольшие число " + c + ".");
            } else {
                System.out.println("Наибольшие число " + c + ".");
            }
        } else {
            System.out.println("Все числа равны и наибольшего из них нет.");
        }
    }
}