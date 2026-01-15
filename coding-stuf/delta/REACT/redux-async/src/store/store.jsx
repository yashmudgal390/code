import { configureStore } from '@reduxjs/toolkit';
import postReducers from '../slice/postSlice';
export const store = configureStore({
    reducer: {
        posts: postReducers,
    }
})