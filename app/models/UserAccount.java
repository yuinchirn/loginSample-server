package models;

import models.abstracts.AbstractUserAccount;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * Created by yuinchirn on 2014/10/16.
 */
@Entity
public class UserAccount extends AbstractUserAccount {

    public static Model.Finder<Long, UserAccount> find = new Model.Finder<Long, UserAccount>(
            Long.class, UserAccount.class
    );


    /**
     * ユーザー名とパスワードで検索した結果を取得
     * @param userName
     * @param password
     * @return
     */
    public static UserAccount findByUserNameAndPassword(String userName, String password){
        return find.where()
                .eq("user_name",userName)
                .eq("password", password)
                .findUnique();
    }
}