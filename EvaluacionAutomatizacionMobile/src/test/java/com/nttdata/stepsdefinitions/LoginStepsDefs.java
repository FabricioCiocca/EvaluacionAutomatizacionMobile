package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginStepsDefs {

    @Steps
    LoginSteps loginSteps;

    @Dado("que me encuentro en el login de SwagLabs")
    public void que_me_encuentro_en_el_login_de_SwagLabs() {
    }
    @Cuando("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String password) {
      loginSteps.enterUser(user);
      loginSteps.enterPass(password);
      loginSteps.clickLogin();
    }
    @Entonces("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String expectedTitle) {
        Assert.assertEquals(expectedTitle, loginSteps.getProductsTitle());
    }
    @Y("también valido que al menos exista un item")
    public void también_valido_que_al_menos_exista_un_item() {
        int itemsListSize = loginSteps.getItemSize();
        Assert.assertTrue("El tamaño de la lista es: " + itemsListSize,itemsListSize > 0);
    }

}
