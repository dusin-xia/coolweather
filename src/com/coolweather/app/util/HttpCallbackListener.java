/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolweather.app.util;

/**
 *
 * @author tengyu
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
