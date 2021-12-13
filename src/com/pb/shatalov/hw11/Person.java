package com.pb.shatalov.hw11;

public class Person {

    private String name;
    private String dateOfBirth;
    private String phone;
    private String address;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String phone, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                " dateOfBirth='" + dateOfBirth + '\'' +
                " phone='" + phone + '\'' +
                " address='" + address + '\'';
    }
}





//Каждый элемент должен иметь:

//ФИО
//дата рождения
//телефоны (количество не ограничено)
//адрес
//дата и время редактирования

//Обеспечить следующий функционал:

//добавление элемента
//удаление элемента
//поиск элементов
//вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
//редактирование элемента
//запись в файл всех данных
//загрузка из файла всех данных