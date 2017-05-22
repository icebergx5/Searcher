/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluetech.searcher;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.extensions.model.layout.LayoutOptions;

/**
 *
 * @author yasin
 */
@ManagedBean(name="searchController") 
@ViewScoped 
public class SearchController implements Serializable {
   
    private List<Result> result;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public void search() {
        
        
        
        
        
    }
    
}
