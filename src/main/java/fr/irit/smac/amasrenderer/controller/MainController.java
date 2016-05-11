package fr.irit.smac.amasrenderer.controller;

import java.net.URL;
import java.util.ResourceBundle;

import fr.irit.smac.amasrenderer.controller.graph.GraphMainController;
import fr.irit.smac.amasrenderer.controller.menu.MenuBarController;
import fr.irit.smac.amasrenderer.controller.service.ServicesController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainController implements Initializable {

    @FXML
    private GraphMainController graphMainController;
    
    @FXML
    private ServicesController servicesController;
    
    @FXML
    private MenuBarController menuBarController;

	@Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public GraphMainController getGraphMainController() {
        return graphMainController;
    }

    public ServicesController getServicesController() {
        return servicesController;
    }

    public MenuBarController getMenuBarController() {
		return menuBarController;
	}
}
