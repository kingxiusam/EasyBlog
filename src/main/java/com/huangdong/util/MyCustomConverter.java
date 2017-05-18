package com.huangdong.util;


import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;
import java.util.Set;

/**
 * Created by Administrator on 2017/2/27.
 */
public class MyCustomConverter implements ConditionalGenericConverter {

    @Override
    public boolean matches(TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor1) {
        return false;
    }

    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        return null;
    }

    @Override
    public Object convert(Object o, TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor1) {
        return null;
    }
}
