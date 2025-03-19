package com.liqiang.code;
import java.util.Random;
public class Role {
    private String roleName;
    private int roleHP;


    public Role(String roleName, int roleHP) {
        this.roleName = roleName;
        this.roleHP = roleHP;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public int getRoleHP() {
        return roleHP;
    }
    public void setRoleHP(int roleHP) {
        this.roleHP = roleHP;
    }
    // 攻击
    public void attack(Role role) {
        Random r = new Random();
        int attackHP = r.nextInt(20) + 1;
        role.hurt(attackHP);
        System.out.println(this.roleName +
                "攻击了" + role.getRoleName() +
                "，造成" + attackHP + "点伤害,"+
                 role.getRoleName() + "剩余血量" +
                (role.getRoleHP() > 0 ? role.getRoleHP() : 0));
        if (role.getRoleHP() <= 0) {
            System.out.println(role.getRoleName() + "死亡");
        }
    }
    // 受伤 扣除血量
    public void hurt(int hurtNum) {
        this.roleHP -= hurtNum;
    }
    //死亡
}



