package com.intuit.extension;

import java.lang.annotation.Annotation;

public class InterceptorRule
{
    private String rule;
    private Annotation interceptorBinding;

    public InterceptorRule(String rule, Annotation interceptorBinding)
    {
        this.rule = rule;
        this.interceptorBinding = interceptorBinding;
    }

    public String getRule()
    {
        return rule;
    }

    public Annotation getInterceptorBinding()
    {
        return interceptorBinding;
    }
}
