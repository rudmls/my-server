/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ruddymonlouis.util;

import fr.ruddymonlouis.domain.User;
import fr.ruddymonlouis.api.model.UserRes;

/**
 *
 * @author akriks Classe utilitaire pour convertir les objets du domaine en
 * ressources api et inversement
 */
public class Utility {

    public static User toDomain(UserRes userRes) {
        return User.builder()
                .id(userRes.getId())
                .firstName(userRes.getFirstName())
                .lastName(userRes.getLastName())
                .createAt(userRes.getCreateAt())
                .build();
    }

    public static UserRes toResource(User user) {
        return new UserRes()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .createAt(user.getCreateAt());
    }

}
