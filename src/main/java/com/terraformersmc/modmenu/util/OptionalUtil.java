package com.terraformersmc.modmenu.util;

import java.util.Optional;

public class OptionalUtil {
	@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
	public static boolean isPresentAndTrue( Optional<Boolean> optional ) {
		return optional.isPresent() && optional.get();
	}
}
