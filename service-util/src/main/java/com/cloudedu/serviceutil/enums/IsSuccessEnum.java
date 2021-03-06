package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IsSuccessEnum {

	SUCCESS(1, "成功", "green"), FAIL(0, "失败", "red");

	private Integer code;

	private String desc;

	private String color;

}
