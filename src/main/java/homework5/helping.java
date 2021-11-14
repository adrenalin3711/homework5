package homework5;

public class helping {
    public static void main(String[] args) { //
        employee[] employees = {   // заралпта в белорусских рублях и телефон без кода делал
                new employee("Artem A.I.", "Engineer", "artem@mail.ru", 7242884, 1000, 38),
                new employee("Ivan I.I.", "Welder", "ivan@mail.ru", 7853401, 1500, 25),
                new employee("Sasha L.A.", "Installer", "sasha@mail.ru", 5482945, 800, 48),
                new employee("Igor O.P.", "Hard worker", "igor@mail.ru", 5333798, 500, 43),
                new employee("Yriy K.K", "Programmer", "yriy@mail.ru", 6789853, 3200, 23),
        };
        for (employee x:  // делал через foreach прост если надо по всем пробежаться им проще не знаю правильно или нет
             employees) {
            if(x.getAge() > 40)
                x.info();
        }
    }
}
