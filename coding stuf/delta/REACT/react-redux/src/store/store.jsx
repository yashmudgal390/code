/*
store is a place where we have all reducers and state 
*/ 
import { configureStore } from '@reduxjs/toolkit';
import counterReducer from '../slices/counterSlice';


export const store = configureStore({
    reducer: {
        counter: counterReducer,// in slice the name will create your action.type in store the name or key we are using will become your state variable 
    }
})