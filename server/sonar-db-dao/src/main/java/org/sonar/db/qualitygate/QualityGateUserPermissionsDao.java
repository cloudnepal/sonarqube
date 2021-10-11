/*
 * SonarQube
 * Copyright (C) 2009-2021 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.db.qualitygate;

import javax.annotation.Nullable;
import org.sonar.api.utils.System2;
import org.sonar.db.Dao;
import org.sonar.db.DbSession;
import org.sonar.db.user.UserDto;

public class QualityGateUserPermissionsDao implements Dao {

  private final System2 system2;

  public QualityGateUserPermissionsDao(System2 system2) {
    this.system2 = system2;
  }

  public boolean exists(DbSession dbSession, QualityGateDto qualityGate, UserDto user) {
    return this.exists(dbSession, qualityGate.getUuid(), user.getUuid());
  }

  public boolean exists(DbSession dbSession, @Nullable String qualityGateUuid, @Nullable String userUuid) {
    if (qualityGateUuid == null || userUuid == null) {
      return false;
    }
    return selectByQualityGateAndUser(dbSession, qualityGateUuid, userUuid) != null;
  }

  public QualityGateUserPermissionsDto selectByQualityGateAndUser(DbSession dbSession, String qualityGateUuid, String userUuid) {
    return mapper(dbSession).selectByQualityGateAndUser(qualityGateUuid, userUuid);
  }

  public void insert(DbSession dbSession, QualityGateUserPermissionsDto dto) {
    mapper(dbSession).insert(dto, system2.now());
  }

  private static QualityGateUserPermissionsMapper mapper(DbSession dbSession) {
    return dbSession.getMapper(QualityGateUserPermissionsMapper.class);
  }
}