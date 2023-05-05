package edu.uaslp.objetos.exceptions;

public class TaskListException extends RuntimeException{
    public TaskListException(){

    }
    public TaskListException(String message){
        super(message);
    }
}

