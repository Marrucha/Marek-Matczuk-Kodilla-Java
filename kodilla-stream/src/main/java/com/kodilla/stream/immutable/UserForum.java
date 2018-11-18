package com.kodilla.stream.immutable;

public final class UserForum {
    private final String userName;
    private final String realName;

    public UserForum(final String userName, final String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }
}
