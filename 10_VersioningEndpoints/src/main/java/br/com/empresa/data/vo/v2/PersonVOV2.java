package br.com.empresa.data.vo.v2;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class PersonVOV2 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String gender;

    private Date birthDay;

}