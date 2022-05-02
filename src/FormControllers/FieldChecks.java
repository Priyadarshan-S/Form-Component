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
            SHOW,HIDE,DISABLE,DEFAULT
        };

        //example condition - Changes Name -> visibility to false
        if(title.equals("Name"))
            return access.HIDE;

        return access.DEFAULT;
    }

    public List<?> valueSupplier(String title, List<?> stringList) {
        List<?> authorisedArray = stringList;

        return authorisedArray;
    }
}
