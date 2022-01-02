package com.bl.address_book;

import java.util.Scanner;

public class UC1_Application
{
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        UC1_UserInterface ui = new UC1_UserInterface();
        int choice = ui.ShowMainMenu();

        UC1_Application abs = new UC1_Application();
        abs.handlerUserSelection(choice);

    }

    public void handlerUserSelection(int choice)
    {
        switch (choice)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Wrong Choice ..!");
                break;
        }
    }
}