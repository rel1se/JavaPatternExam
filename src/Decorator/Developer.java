// Структурный паттерн
// позволяет добавлять новую функциональность объекту, является некоторой оберткой над классом.
// Не управляет жизненным циклом объекта.
//---------------------------------------------------------------------------
//        | Шаблон      | Что делает с интерфейсом | Что делает с функциональностью |
//        ---------------------------------------------------------------------------
//        | Декоратор   | Не изменяет/расширяет    | Расширяет                      |
//        ---------------------------------------------------------------------------
//        | Адаптер     | Изменяет                 | Не изменяет                    |
//        ---------------------------------------------------------------------------


package Decorator;

public interface Developer {
    public String makeJob();
}