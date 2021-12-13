package com.pb.shatalov.hw11;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook extends ArrayList<Person>{
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Person person : this) {
            stringBuilder.append("----------------------------\n");
            stringBuilder.append("Name:" + person.getName() + "\n");
            stringBuilder.append("Name:" + person.getDateOfBirth() + "\n");
            stringBuilder.append("Number:" + person.getPhone() + "\n");
            stringBuilder.append("Name:" + person.getAddress() + "\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {





        List<Person> personList = new ArrayList<>();
       // Person person = new Person("Vovan", "05042001", "156161651", "попихуйловка", LocalDate.now());

        personList.add(new Person("Vovan", "05042001", "156161651", "попихуйловка"));
        personList.add(new Person("Kolyan", "05042002", "156231651", "попихуйловка2"));
        System.out.println(personList);

        personList.remove(0);
        System.out.println(personList);

    }

}










//Каждый элемент должен иметь:
//ФИО
//дата рождения
//телефоны (количество не ограничено)
//адрес
//дата и время редактирования
//
//Обеспечить следующий функционал:
//добавление элемента
//удаление элемента
//поиск элементов
//вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
//редактирование элемента
//запись в файл всех данных
//загрузка из файла всех данных