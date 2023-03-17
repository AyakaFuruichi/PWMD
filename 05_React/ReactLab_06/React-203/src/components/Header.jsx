import React from "react";
import "../index.css";

const HeaderOne = ({ user, setUser }) => {
	return (
		<>
			<header className="flex h-12 bg-gray-800 z-10">
				<p className="text-2xl font-serif h-5 m-2">Welcome, {user}</p>
				<div className="pr-2 flex-1 h-full flex justify-end items-center mx-8">
					<button
						onClick={() => setUser("")}
						className=" bg-slate-100 text-black font-serif font-black "
					>
						Logout
					</button>
				</div>
			</header>
		</>
	);
};

export default HeaderOne;
