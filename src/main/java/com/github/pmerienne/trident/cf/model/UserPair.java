/**
 * Copyright 2013-2015 Pierre Merienne
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pmerienne.trident.cf.model;

import java.io.Serializable;

public class UserPair implements Serializable {

	private static final long serialVersionUID = -8998812873524819698L;

	private long user1;
	private long user2;

	public UserPair() {
	}

	public UserPair(long user1, long user2) {
		this.user1 = Math.min(user1, user2);
		this.user2 = Math.max(user1, user2);
	}

	public long getUser1() {
		return user1;
	}

	public void setUser1(long user1) {
		this.user1 = user1;
	}

	public long getUser2() {
		return user2;
	}

	public void setUser2(long user2) {
		this.user2 = user2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (user1 ^ (user1 >>> 32));
		result = prime * result + (int) (user2 ^ (user2 >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPair other = (UserPair) obj;
		if (user1 != other.user1)
			return false;
		if (user2 != other.user2)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserPair [user1=" + user1 + ", user2=" + user2 + "]";
	}

}
