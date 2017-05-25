package dz.software.bkfaces.component;

import java.io.IOException;
import java.util.Hashtable;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@ResourceDependencies({
        @ResourceDependency(
                name = "bkfaces-avatar.css", library = "css", target = "head")
})
@FacesComponent(value = "avatar")
public class AvatarComponent extends UIOutput {


    @Override
    public String getFamily() {

        return "dz.software.bkfaces.component";

    }

    public AvatarComponent() {

    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException {

        String name = (String) getAttributes().get("name");
        String style = (String) getAttributes().get("style");
        ResponseWriter writer = context.getResponseWriter();
        StringBuilder strCreateAvatar = new StringBuilder();
        strCreateAvatar.append("class=\"gavatar\" ");
        if (style != null) {
            strCreateAvatar.append("style = \"" + style + "\"");
        }
        System.out.println(strCreateAvatar.toString());


        if (name != null) {

            writer.write("<div " + strCreateAvatar.toString() + ">" + name + "</div>");


        } else {
            writer.write("<div class=\"gavatar\">!</div>");
        }


    }

}