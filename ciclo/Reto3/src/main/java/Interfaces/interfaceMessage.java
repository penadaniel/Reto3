/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USER
 */
public interface interfaceMessage extends CrudRepository<Message,Integer> {
    
}
