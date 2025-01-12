public class Car {
    // Свойства класса
    private String make;
    private String model;
    private int year;
    private int mileage;

    // Конструктор
    public Car(String make, String model, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Метод для отображения информации об автомобиле
    public void displayInfo() {
        System.out.println("Марка: " + make);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Пробег: " + mileage + " км");
    }

    // Метод для увеличения пробега
    public void increaseMileage(int amount) {
        if (amount > 0) {
            mileage += amount;
            System.out.println("Пробег увеличен на " + amount + " км. Новый пробег: " + mileage + " км");
        } else {
            System.out.println("Пробег не может быть увеличен на отрицательное значение.");
        }
    }

    // Метод для проверки, старый ли автомобиль
    public boolean isOldCar() {
        return year < 2000;
    }

    // Метод для обновления модели автомобиля
    public void updateModel(String newModel) {
        model = newModel;
        System.out.println("Модель обновлена на: " + model);
    }

    // Метод для проверки состояния пробега
    public boolean isHighMileage() {
        return mileage > 100000;
    }

    // Метод для изменения марки и модели одновременно
    public void updateMakeAndModel(String newMake, String newModel) {
        make = newMake;
        model = newModel;
        System.out.println("Марка и модель обновлены на: " + make + " " + model);
    }

    // Метод для получения года выпуска автомобиля
    public int getYear() {
        return year;
    }

    // Демонстрация использования класса
    public static void main(String[] args) {
        // Создаем объект автомобиля
        Car myCar = new Car("Toyota", "Corolla", 1998, 120000);

        // Отображаем информацию об автомобиле
        myCar.displayInfo();

        // Увеличиваем пробег
        myCar.increaseMileage(5000);

        // Проверяем, старый ли автомобиль
        if (myCar.isOldCar()) {
            System.out.println("Это старый автомобиль.");
        } else {
            System.out.println("Это не старый автомобиль.");
        }

        // Обновляем модель автомобиля
        myCar.updateModel("Camry");

        // Проверяем состояние пробега
        if (myCar.isHighMileage()) {
            System.out.println("Пробег автомобиля высокий.");
        } else {
            System.out.println("Пробег автомобиля не высокий.");
        }

        // Изменяем марку и модель автомобиля
        myCar.updateMakeAndModel("Honda", "Civic");

        // Получаем год выпуска автомобиля
        System.out.println("Год выпуска автомобиля: " + myCar.getYear());
    }
}