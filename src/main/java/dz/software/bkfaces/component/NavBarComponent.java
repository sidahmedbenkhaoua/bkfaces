package dz.software.bkfaces.component;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import java.io.IOException;

/**
 * Created by benkraoua.sidahmed on 25/05/2017.
 */
@ResourceDependencies({
        @ResourceDependency(
                name = "bootstrap.min.css", library = "css", target = "head"),@ResourceDependency(name = "jquery.min.js",library = "js",target = "head"),
        @ResourceDependency(name = "bootstrap.min.js",library = "js",target = "head")
})
@FacesComponent(value = "navBar")
public class NavBarComponent extends UIOutput {

    @Override
    public String getFamily() {

        return "dz.software.bkfaces.component";

    }

    public NavBarComponent() {

    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException {




    }


    @Override
    public void encodeEnd(FacesContext context) throws IOException {




    }

}
