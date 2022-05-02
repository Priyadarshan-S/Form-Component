package FormControllers;

import java.util.List;

public class FieldChecks {

    public Boolean RoleCheck(String userRole,String allowedRole){
        Boolean hasRole = false;
        if(allowedRole.equals(userRole) || allowedRole.equals("All"))
            hasRole = true;
        return hasRole;
    }

    public List<?> valueSupplier(List<?> stringList) {
        List<?> authorisedArray = stringList;

        return authorisedArray;
    }
}
