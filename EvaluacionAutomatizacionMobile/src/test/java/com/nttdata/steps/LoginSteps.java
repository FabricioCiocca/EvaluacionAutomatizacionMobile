package com.nttdata.steps;

import com.nttdata.screens.InventoryScreen;
import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginScreen loginScreen;
    InventoryScreen inventoryScreen;

    @Step("Ingresar usuario")
    public void enterUser(String user){
        loginScreen.enterUserInput(user);
    }

    @Step("Ingresar contraseña")
    public void enterPass(String password){
        loginScreen.enterPassInput(password);
    }

    @Step("Click en Login")
    public void clickLogin(){
        loginScreen.clickLogin();
    }

    @Step("Obtiene el título de Productos")
    public String getProductsTitle(){
        return inventoryScreen.getProductsTitle();
    }

    @Step("Obtiene la cantidad de Items")
    public int getItemSize(){
        return inventoryScreen.getItemSize();
    }
}
