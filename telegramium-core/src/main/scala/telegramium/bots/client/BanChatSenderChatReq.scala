package telegramium.bots.client

import telegramium.bots.ChatId

/** @param chatId
  *   Unique identifier for the target chat or username of the target channel (in the format &#064;channelusername)
  * @param senderChatId
  *   Unique identifier of the target sender chat
  */
final case class BanChatSenderChatReq(chatId: ChatId, senderChatId: Int)
