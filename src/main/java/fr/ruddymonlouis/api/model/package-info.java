/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@XmlJavaTypeAdapters({ @XmlJavaTypeAdapter(LocalDateAdapter.class)})
package fr.ruddymonlouis.api.model;

import fr.ruddymonlouis.util.LocalDateAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

