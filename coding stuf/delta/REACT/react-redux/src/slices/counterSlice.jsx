/*
immer js is a bridge
React cares about IMMUTABLE RESULTS, not how you write the code.

immer js is a bridge
React cares about IMMUTABLE RESULTS, not how you write the code.

immutablity is required in react as react decide to re render by checking its pervious state and current state if we mutate there will be no previous state 
Reference stays same → React thinks nothing changed

Immer gives you a DRAFT STATE.
State = 📜 Legal document
Draft = ✏️ Rough paper
You write on draft
Immer photocopies final clean document
You never touch the original.

Wraps state in a Proxy
Tracks reads & writes
Records mutations
Produces new state object
Preserves immutability

Interview-Level Answer

“In Redux Toolkit, reducers appear to mutate state, but Immer intercepts these mutations on a draft state and produces 
 a new immutable state behind the scenes, preserving Redux principles.”

*/

import { createSlice } from "@reduxjs/toolkit";

const initialValue={
    count:0,
}

const counterSlice =createSlice({
    name:'counter',
    initialValue,
    reducers:{
        increment:state =>state.count = state.count +1,//createSlice will create a type --> 'counter/increment'
        decrement:state=> state.count = state.count-1,
    }
})