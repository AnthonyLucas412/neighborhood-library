package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedout;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedout = false;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public void setCheckedout(boolean checkedout) {
        isCheckedout = checkedout;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name) {
        if (!isCheckedout) {
            isCheckedout = true;
            checkedOutTo = name;
            System.out.println(title + " has been checked out to " + name);
        } else {
            System.out.println(title + " is already checked out. ");
        }

    }


    public void checkIn() {
        if (isCheckedout) {
            isCheckedout = false;
            checkedOutTo = null;
            System.out.println(title + " has been checked in.");
        } else {

            System.out.println(title + " has been checked in already.");
        }
    }
}