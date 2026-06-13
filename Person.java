/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_details ;

/**
 *
 * @author DELL
 */
public class Person
{
    int person1_age ; 
    float person1_height , person1_weight ; 
    String person1_name , Person1_home_town ; 
    
    
    
   
    int person2_age ; 
    float person2_height , person2_weight ; 
    String person2_name , person2_home_town ; 
        
        
    
    
    
    
    
    
    
    
    public Person (int person1_age, float person1_height, float person1_weight, String person1_name , String Person1_home_town, int person2_age , float person2_height , float person2_weight, String person2_name , String person2_home_town) 

    {
   
        this.person1_age = person1_age  ; 
        this.person1_height = person1_height ; 
        this.person1_weight = person1_weight ; 
        this.person1_name = person1_name ; 
        this.Person1_home_town = Person1_home_town ; 
        this.person2_age = person2_age ; 
        this.person2_height = person2_height ; 
        this.person2_weight = person2_weight ;  
        this.person2_name = person2_name ; 
        this.person2_home_town = person2_home_town ; 
    
    
    } 

    
    
    
    
    
    
    
    
    void Display()
    {
        System.out.println("Person_1") ; 
        
        System.out.println("Name : " + person1_age ) ; 
    
        System.out.println("Hight : " + person1_height) ; 
    
        System.out.println("Weight : " + person1_weight) ;
    
        System.out.println("Home_Town : " + Person1_home_town ) ;
    
    
    
    
        System.out.println() ;
    
    
        System.out.println("Person_2") ; 
    
        System.out.println("Name : " + person2_age ) ; 

        System.out.println("Hight : " + person2_height) ; 

        System.out.println("Weight : " + person2_weight) ;

        System.out.println("Home_Town : " + person2_home_town ) ;
    
    }
    
    
    
    
    
}






