package models.abstracts;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.*;
import play.data.validation.*;

import java.util.Date;

/**
 * Created by yuinchirn on 2014/10/18.
 */
@Entity
public abstract class AbstractUserAccount extends Model {

    @Id
    public Long id;

    public String userName;

    public String userHash;

    public String password;

    public Date createDate;

    public Date updateDate;

    public Boolean delete_flg;
}