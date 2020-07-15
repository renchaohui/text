package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 任朝辉
 * @date 2020/1/10 8:56
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Integer id;
    private String name;
    private String password;
    private String sex;
}
