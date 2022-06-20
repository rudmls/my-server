/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ruddymonlouis.exceptions;

/**
 *
 * @author akriks
 */
public class AppliException extends RuntimeException {
 
       private static final  String MESSAGE="Informations  incorrectes - Vérifiez vos données";
        
        public AppliException() {
            super(MESSAGE);
        }        
        public AppliException(String message) {
          super(message);
        }
        
        public AppliException(String message, Throwable t) {
            super(message, t);
        }
        
}
