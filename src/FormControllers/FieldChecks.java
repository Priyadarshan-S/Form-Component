package FormControllers;

import java.util.List;

public class FieldChecks {

    public Boolean RoleCheck(String userRole,String allowedRole){
        Boolean hasRole = false;
        if(allowedRole.equals(userRole) || allowedRole.equals("All"))
            hasRole = true;
        return hasRole;
    }

    public Enum<?> FieldAuthorize(String title)
    {
        enum access {
            SHOW,HIDE,DISABLE
        };


        return access.SHOW;
    }

    public List<?> valueSupplier(List<?> stringList) {
        List<?> authorisedArray = stringList;

        return authorisedArray;
    }
}
