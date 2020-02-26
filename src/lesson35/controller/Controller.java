package lesson35.controller;

import lesson35.model.UserNow;
import lesson35.model.UserType;

public class Controller {
    public void validateUSER_Access() throws Exception {
        validateLoginAccess();
    }

    public void validateADMIN_Access() throws Exception {
        validateLoginAccess();
        if (UserNow.getUserNow().getUserType() != UserType.ADMIN)
            throw new Exception("you do not have access");
    }

    private void validateLoginAccess() throws Exception {
        if (!UserNow.statusLogin()) throw new Exception("no login");
    }
}
