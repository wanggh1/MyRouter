package com.xiaoniu.finance.router.core;

import android.content.Context;
import android.os.Bundle;

import com.xiaoniu.finance.router.result.XnResultCode;
import com.xiaoniu.finance.router.result.XnRouterResult;

/**
 * 业务操作异常情况
 */
public class XnRouterException extends XnAbstractTrack {

    private static final String DEFAULT_MESSAGE = "error";
    public final int mCode;
    public final String mMessage;

    public XnRouterException() {
        mCode = XnResultCode.CODE_NOT_FOUND;
        mMessage = DEFAULT_MESSAGE;
    }

    public XnRouterException(int code, String message) {
        this.mCode = code;
        this.mMessage = message;
    }

    @Override
    public XnRouterResult fire(Context context, Bundle requestData) {
        XnRouterResult result = new XnRouterResult.Builder()
                .code(mCode)
                .msg(mMessage)
                .data(null)
                .object(null)
                .build();
        return result;
    }

}
