package controllers;

import models.UserAccount;
import play.*;
import play.data.DynamicForm;
import play.mvc.*;

import views.html.*;

import static play.data.Form.form;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }


    public static Result auth() {

        DynamicForm form = form().bindFromRequest();
        String userName = form.get("userName");
        String pw = form.get("password");

        UserAccount userAccount = UserAccount.findByUserNameAndPassword(userName,pw);

        Logger.debug(String.format("ユーザー名：%s　パスワード：%s",userName,pw));   

        if(userAccount == null){
            Logger.debug("IDかパスワードが間違っています。");
            return badRequest();
        }

        Logger.debug("ログイン成功");
        return  ok();
    }
}
